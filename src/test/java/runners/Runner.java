package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@booking",
        dryRun =false
        /*
         Eger ki featureslarda bizim eksik yani daha once tanimlanmamis(turuncu sekilde gozukmesi) scenriolari belirlemek icin
        eksik adim olup olmadigi dryRun i TRUE yaparak kontrol etmis oluyor
        Eger ki testlerimiz passed olursa bu testlerimizin basarili oldugunu degil eksik adimlarin olmadigi yani testlerimizin
        kosturmaya hazir oldugu anlamina gelmektedir

        Eger ki eksik adimimiz yok ise tum islemleri tamamladigimizda TESTLERIMI KOSTURMAK ICIN DRYRUN'I FALSE yapiyoruz



         */
)

public class Runner {
}