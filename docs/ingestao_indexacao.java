import com.azure.core.util.Context;
import com.azure.search.documents.SearchClient;
import com.azure.search.documents.SearchClientBuilder;
import com.azure.search.documents.models.*;

public class IngestaoIndexacao {
    public static void main(String[] args) {
        String searchServiceName = "SEU_SERVICO_DE_BUSCA";
        String apiKey = "SUA_CHAVE_API";
        String indexName = "meu-indice";

        SearchClient client = new SearchClientBuilder()
            .endpoint("https://" + searchServiceName + ".search.windows.net")
            .credential(new AzureKeyCredential(apiKey))
            .indexName(indexName)
            .buildClient();

        // Exemplo: Consulta no índice
        SearchPagedIterable results = client.search("documento");
        results.forEach(result -> System.out.println(result.getDocument()));
    }
}
