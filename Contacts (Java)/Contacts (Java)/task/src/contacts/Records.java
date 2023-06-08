package contacts;

import java.util.ArrayList;
import java.util.List;

public class Records {
    List<ContactRecord> records;
    public Records() {
        this.records = new ArrayList<>();
    }

    public void addRecord(ContactRecord record) {
        records.add(record);
    }
}
