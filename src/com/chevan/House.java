package com.chevan;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;


/**
 * Created by localadmin on 7/27/16.
 */
public class House {
    private String name;
    private ArrayList<Room> rooms;

    public House(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(String name, Floor floor, Paint paint, int length, int width, int height){
        List<Room> duplicateRooms = this.rooms.stream().filter(r -> r.getName().equals(name)).collect(toList());
        if(duplicateRooms.size() > 0) {
            System.out.println("No room created. Already have room with name " + name);
            return;
        }

        Room room = new Room(name, floor, paint, length, width, height);
        rooms.add(room);
    }


    public double totalCost(){
        return this.totalFloorCost() + this.totalPaintCost();
    }

    public double totalPaintCost() {
        return this.rooms.stream().map(Room::paintCost).reduce(0.0, (sum, value) -> sum + value);
    }

    public double totalFloorCost(){
        return this.rooms.stream().map(Room::floorCost).reduce(0.0, (sum, value) -> sum + value);
    }

}
