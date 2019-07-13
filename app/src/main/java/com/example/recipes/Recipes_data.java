package com.example.recipes;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Recipes_data {

    private SQLiteDatabase database;
    private SqlLiteHelper dbHelper;

    private String[] allColumns = {SqlLiteHelper.COLUMN_ID, SqlLiteHelper.COLUMN_TITLE, SqlLiteHelper.COLUMN_DESC, SqlLiteHelper.COLUMN_URL};

    public Recipes_data(Context context){
        dbHelper = new SqlLiteHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public ArrayList<Recipes> getAllRecipes(){
        ArrayList<Recipes> recipes = new ArrayList<>();

        Cursor cursor = database.query(SqlLiteHelper.TABLE_RECIPES, allColumns, null, null, null, null, null);

        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            Recipes recipe = new Recipes();
            recipe.setId(cursor.getInt(0));
            recipe.setTitle(cursor.getString(1));
            recipe.setDescription(cursor.getString(2));
            recipe.setUrl(cursor.getString(3));

            recipes.add(recipe);

            cursor.moveToNext();
        }

        return recipes;
    }

    public Recipes getRecipe(String id){
        Recipes recipe = new Recipes();

        Cursor cursor = database.query(SqlLiteHelper.TABLE_RECIPES, allColumns, "id=?", new String[]{id}, null, null, null);

        cursor.moveToFirst();
        recipe.setId(Integer.valueOf(id));
        recipe.setTitle(cursor.getString(1));
        recipe.setDescription(cursor.getString(2));
        recipe.setUrl(cursor.getString(3));

        return recipe;
    }
}
