package pt.ipbeja.recurso.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Movie.class}, version = 1, exportSchema = false)
public abstract class MovieDatabase extends RoomDatabase {

    private static MovieDatabase INSTANCE = null;


    public static MovieDatabase getInstance(Context context) {
        context = context.getApplicationContext();

        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context, MovieDatabase.class, "movie-db")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }


    public abstract MovieDao movieDao();
}
