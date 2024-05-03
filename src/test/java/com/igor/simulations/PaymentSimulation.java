package com.igor.simulations;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.time.Duration;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

public class PaymentSimulation extends Simulation {

    HttpProtocolBuilder httpProtocol = http.baseUrl("https://kab-dev.kab.com.br/payment-gateways/mundipagg/");
    ScenarioBuilder scenario = scenario("OrderResource")
            .exec(http("post orderResource")
                    .post("/update-order-status")
                    .header("Content-Type", "application/json")
                    .body(StringBody(
                            "{\"id\":\"hook_kJ5vBnOIwIZXe81d\"," +
                                    "\"account\":{\"id\":\"acc_J2GWe7dCpGswb5no\",\"name\":\"klab - Test\"}," +
                                    "\"type\":\"order.paid\"," +
                                    "\"data\":{" +
                                    "\"id\":\"or_E4MDnbpiQi87ekoY\"," +
                                    "\"code\":\"KQ3WFYFRQ0\"," +
                                    "\"amount\":500," +
                                    "\"currency\":\"BRL\"," +
                                    "\"closed\":true," +
                                    "\"items\":[" +
                                    "{\"id\":\"oi_BXJOn4qIVIbR8dDe\"," +
                                    "\"type\":\"product\"," +
                                    "\"description\":\"Parcela 01/01 do cartão de crédito 9977329\"," +
                                    "\"category\":\"credit-card\"," +
                                    "\"amount\":500," +
                                    "\"quantity\":1," +
                                    "\",status\":\"active\"," +
                                    "\"created_at\":\"2024-04-03T17:56:12\"," +
                                    "\"updated_at\":\"2024-04-03T17:56:12\"," +
                                    "\"code\":\"9977329_F\"" +
                                    "}" +
                                    "]," +
                                    "\"customer\":{" +
                                    "\"id\":\"cus_RWKr7NZfMfX7E0nO\"," +
                                    "\"name\":\"Maria Da Gloria Veiga\"," +
                                    "\"email\":\"vanderlei.loureiro@evoluum.com.br\"," +
                                    "\"document\":\"64601706904\"," +
                                    "\"type\":\"individual\"," +
                                    "\"delinquent\":false," +
                                    "\"address\":{" +
                                    "\"id\":\"addr_glQVDX8SBSVDzP7N\"," +
                                    "\"line_1\":\"RUA NESTOR FERMINO VIEIRA  245\"," +
                                    "\"line_2\":\"RUA PX AO POSTINHO DE SAUDE\"," +
                                    "\"zip_code\":\"89245000\"," +
                                    "\"city\":\"ARAQUARI\"," +
                                    "\"state\":\"SC\"," +
                                    "\"country\":\"BR\"," +
                                    "\"status\":\"active\"," +
                                    "\"created_at\":\"2024-03-27T21:07:20\"," +
                                    "\"updated_at\":\"2024-03-27T21:07:20\"" +
                                    "}," +
                                    "\"created_at\":\"2024-03-27T21:07:20\"," +
                                    "\"updated_at\":\"2024-03-27T21:07:20\"," +
                                    "\"phones\":{}" +
                                    "}," +
                                    "\"status\":\"paid\"," +
                                    "\"created_at\":\"2024-04-03T17:56:12\"," +
                                    "\"updated_at\":\"2024-04-03T17:56:19\"," +
                                    "\"closed_at\":\"2024-04-03T17:56:12\"," +
                                    "\"charges\":[" +
                                    "{\"id\":\"ch_9LgNjQdHDHZPX1oJ\"," +
                                    "\"code\":\"KQ3WFYFRQ0\"," +
                                    "\"amount\":500," +
                                    "\"paid_amount\":500," +
                                    "\"status\":\"paid\"," +
                                    "\"currency\":\"BRL\"," +
                                    "\"payment_method\":\"boleto\"," +
                                    "\"paid_at\":\"2024-04-03T17:56:12\"," +
                                    "\"created_at\":\"2024-04-03T17:56:12\"," +
                                    "\"updated_at\":\"2024-04-03T17:56:19\"," +
                                    "\"customer\":{" +
                                    "\"id\":\"cus_RWKr7NZfMfX7E0nO\"," +
                                    "\"name\":\"Maria Da Gloria Veiga\"," +
                                    "\"email\":\"vanderlei.loureiro@evoluum.com.br\"," +
                                    "\"document\":\"64601706904\"," +
                                    "\"type\":\"individual\"," +
                                    "\"delinquent\":false," +
                                    "\"address\":{" +
                                    "\"id\":\"addr_glQVDX8SBSVDzP7N\"," +
                                    "\"line_1\":\"RUA NESTOR FERMINO VIEIRA  245\"," +
                                    "\"line_2\":\"RUA PX AO POSTINHO DE SAUDE\"," +
                                    "\"zip_code\":\"89245000\"," +
                                    "\"city\":\"ARAQUARI\"," +
                                    "\"state\":\"SC\"," +
                                    "\"country\":\"BR\"," +
                                    "\"status\":\"active\"," +
                                    "\"created_at\":\"2024-03-27T21:07:20\"," +
                                    "\"updated_at\":\"2024-03-27T21:07:20\"" +
                                    "}," +
                                    "\"created_at\":\"2024-03-27T21:07:20\"," +
                                    "\"updated_at\":\"2024-03-27T21:07:20\"," +
                                    "\"phones\":{}" +
                                    "}," +
                                    "\"last_transaction\":{" +
                                    "\"id\":\"tran_Y5K04LgfnfWoLNgP\"," +
                                    "\"transaction_type\":\"boleto\"," +
                                    "\"gateway_id\":\"591eb58a-dc0b-4e5f-af3e-8fcf7e46b21b\"," +
                                    "\"amount\":500," +
                                    "\"status\":\"paid\"," +
                                    "\"success\":true," +
                                    "\"paid_amount\":500," +
                                    "\"paid_at\":\"2024-04-03T17:56:12\"," +
                                    "\"url\":\"https://simulatorpages.pagar.me/boleto/591eb58a-dc0b-4e5f-af3e-8fcf7e46b21b\"," +
                                    "\"pdf\":\"https://api.pagar.me/core/v5/transactions/tran_gjavErlumu3WkwNA/pdf\"," +
                                    "\"line\":\"23792656029000471149635005393703774970000003663\"," +
                                    "\"barcode\":\"https://api.pagar.me/core/v5/transactions/tran_gjavErlumu3WkwNA/barcode\"," +
                                    "\"qr_code\":\"https://api.pagar.me/core/v5/transactions/tran_gjavErlumu3WkwNA/qrcode\"," +
                                    "\"nosso_numero\":\"1111111\"," +
                                    "\"type\":\"DM\"," +
                                    "\"document_number\":\"997056\"," +
                                    "\"instructions\":\"Não receber após o vencimento.  Os encargos de atraso serão cobrados no próximo vencimento. Documentos: Fatura KAB 9977329 (Vencto: 10/02/2024).\",\"due_at\":\"2024-04-03T23:59:59\"," +
                                    "\"created_at\":\"2024-04-03T17:56:19\"," +
                                    "\"updated_at\":\"2024-04-03T17:56:19\"," +
                                    "\"gateway_response\":{}," +
                                    "\"antifraud_response\":{}," +
                                    "\"metadata\":{}" +
                                    "}" +
                                    "}],\"checkouts\":[]}}"
                    )).asJson());

    {
        setUp(
                scenario.injectOpen(constantUsersPerSec(1).during(Duration.ofMinutes(1)))
        ).protocols(httpProtocol);

//        setUp(scenario.injectOpen(
//                rampUsersPerSec(1).to(4000).during(Duration.ofSeconds(120))
//        )).protocols(httpProtocol);
    }
}
