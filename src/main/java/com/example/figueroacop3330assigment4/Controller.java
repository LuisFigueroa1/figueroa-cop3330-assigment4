/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Luis Figueroa
 */

package com.example.figueroacop3330assigment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    Button addList;
    @FXML
    Button removeList;
    @FXML
    Button editList;
    @FXML
    Button markComplete;
    @FXML
    Button allFilter;
    @FXML
    Button notCompleteFilter;
    @FXML
    Button completeFilter;
    @FXML
    Button editItem;
    @FXML
    Button exportAll;
    @FXML
    Button exportSingle;
    @FXML
    Button importAll;
    @FXML
    Button importSingle;
    @FXML
    Button removeItem;
    @FXML
    Button addItem;
    @FXML
    TextField editName;
    @FXML
    TextField listTitle;
    @FXML
    TextField editDescription;
    @FXML
    TextField addName;
    @FXML
    TextField addDescription;
    @FXML
    DatePicker addDate;
    @FXML
    DatePicker editDate;
    @FXML
    MenuButton addListMenu;
    @FXML
    MenuButton filterMenu;
    @FXML
    MenuButton editItemMenu;
    @FXML
    MenuButton exportMenu;
    @FXML
    MenuButton importMenu;
    @FXML
    MenuButton addItemMenu;
    @FXML
    MenuButton sortMenu;
    @FXML
    Button sortRecent;
    @FXML
    Button sortOld;
    @FXML
    ListView<event2> listDisplay;
    @FXML
    ListView<event> itemDisplay;

    @FXML
    protected void markCompleteA(){
        //Will mark an item as complete
        //will replace the name of the item with: "complete" + original itemName
    }

    @FXML
    protected void removeListA(){
        //Will remove a selected list
        //by removing the list from the observable list view
    }

    @FXML
    protected void removeItemA(){
        //Will remove a selected item in a list
        //by removing the item from the observable list view
    }

    @FXML
    protected void editListA(){
        //Will allow the user edit a list
        //by replacing the item with a new item containing the new data
    }

    @FXML
    protected void addListMenuA(){
        //lets the user open the "add list" menu
    }

    @FXML
    protected void addListA(){
        //lets the user add a list with the information from the title text box
        //creates a new element in the observable list
    }

    @FXML
    protected void addItemMenuA(){
        //lets the user open the "add item" menu
    }

    @FXML
    protected void addItemA(){
        //adds the item to the to do list with the information filled in the
        //text boxes and date setter
        //using Local date technique to make it not possible for the user to go back in time
    }

    @FXML
    protected void editItemMenuA(){
        //opens the "edit item" menu
    }

    @FXML
    protected void editItemA(){
        //lets the user edit the item with the information filled in the
        //text boxes and date setter
        //replaces the item selected with the new information entered and deletes the old
    }

    @FXML
    protected void filterMenuA(){
        //lets the user open the "filter" menu
    }

    @FXML
    protected void completeFilterA(){
        //if selected the items and lists are sorted for "completed" ones
        //will sort the items that have the word "completed" in its name
    }

    @FXML
    protected void allFilterA(){
        //if selected shows all the items  and lists ("completed" and "not-completed")
    }

    @FXML
    protected void notCompleteFilterA(){
        //if selected the items and lists are sorted for "not-completed" ones
        //hides the elements with "completed in its name"
    }

    @FXML
    protected void exportMenuA(){
        //opens the export menu for the user
        //it will make use of Csv files
    }

    @FXML
    protected void exportAllA(){
        //this action will export all the lists and items to the computer hard drive
    }

    @FXML
    protected void exportSingleA(){
        //this action will export a single list to the computer hard drive
    }

    @FXML
    protected void importMenuA(){
        //opens the export menu for the user
        //it will make use of Csv files
    }

    @FXML
    protected void importAllA(){
        //this action will import all the lists and items from a place in
        //the computer hard drive to the app
    }

    @FXML
    protected void importSingleA(){
        //this action will import a single list from a place in
        //the computer hard drive to the app
    }

    @FXML
    protected void sortMenuA(){
        //opens the sort menu for the user
        //the date picker will print the date before the name and this will be used
        //for sorting them by name basically
    }

    @FXML
    protected void sortRecentA(){
        //This action will sort the items with most recent ones first
        //the date picker will print the date before the name and this will be used
        //for sorting them by name basically
    }

    @FXML
    protected void sortOldA(){
        //This action will sort the items with least recent ones first
        //the date picker will print the date before the name and this will be used
        //for sorting them by name basically
    }

}