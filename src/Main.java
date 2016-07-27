import com.chevan.Floor;
import com.chevan.House;
import com.chevan.Paint;

/**
 * Created by localadmin on 7/27/16.
 */
public class Main {

    public static void main(String[] args){
        House h1 = new House("Hearst Castle");
        h1.addRoom("Master Bedroom", Floor.Carpet, Paint.SemiGloss, 20, 22, 10);
        h1.addRoom("Bedroom 1", Floor.Hardwood, Paint.Matte, 15, 12, 10);
        h1.addRoom("Bedroom 2", Floor.Tile, Paint.Gloss, 5, 22, 10);
        h1.addRoom("Living Room", Floor.Trampoline, Paint.Chrome, 30, 50, 20);
        h1.addRoom("Master Bedroom", Floor.Concrete, Paint.Textured, 2, 100, 7);

        System.out.println("Number of rooms: " + h1.getRooms().size());
        h1.getRooms().forEach(room -> System.out.println(room.getName() +
                " --- Floor Cost: " + room.floorCost() + " --- Paint Cost: " + room.paintCost()));
        System.out.println("Total floor cost: " + h1.totalFloorCost());
        System.out.println("Total paint cost: " + h1.totalPaintCost());
        System.out.println("Total House Cost: " + h1.totalCost());
    }
}
