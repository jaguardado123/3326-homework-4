package problem3;

public class Inventory {
    // Do NOT modify
    private Database db;

    
    public void connectionType(String type) {
        // If the type is "firebase" initialize a FirebaseDB object and assign it to db.
        // If the type is "supabase" initialize a SupabaseDB object and assign it to db.
        // If the type is "sqlite" initialize a SQLiteDB object and assign it to db.
        // If the type is "microsoftSQL" initialize a MicrosoftSQL_DB object and assign it to db.
        // Add your code here


        // ==================
    }

    public String connectionStatus() {
        // Do NOT modify
        return this.db.connect();
    }
}