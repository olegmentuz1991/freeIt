package lesson7.maintask.nasa;

import lesson7.maintask.nasa.shuttles.Shuttle;
import lesson7.maintask.nasa.shuttles.SpaceXShuttle;

public class Run {
    public static void main(String[] args) {
        Cosmodrome baikonoor = new Cosmodrome();
        Shuttle phiona = new Shuttle();
        SpaceXShuttle shuttle = new SpaceXShuttle(false);
        baikonoor.launch(phiona);
        baikonoor.launch(shuttle);
    }
}
