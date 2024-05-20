import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class ArchitectureTest {
    @Test
    public void MainPackageConnectRules() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("main");

        ArchRule rule = classes().that().resideInAPackage("main")
                        .should().onlyAccessClassesThat()
                        .resideInAnyPackage("rota", "services", "java.*");

        rule.check(importedClasses);
    }

    @Test
    public void ServicePackageConnectRules() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("services");

        ArchRule rule = classes().that().resideInAPackage("services")
                .should().onlyAccessClassesThat()
                .resideInAnyPackage("rota", "java.*");

        rule.check(importedClasses);
    }

    @Test
    public void RotaPackagedConnectRules() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("rota");

        ArchRule rule = classes().that().resideInAPackage("rota")
                .should().onlyAccessClassesThat()
                .resideInAnyPackage("rota", "java.*");

        rule.check(importedClasses);
    }
}
