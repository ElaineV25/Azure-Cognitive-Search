public class FileIngestionService {
    public List<DataModel> parseCSV(String filePath) throws IOException {
        List<DataModel> entries = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                entries.add(new DataModel(line[0], line[1], line[2]));
            }
        }
        return entries;
    }
}

