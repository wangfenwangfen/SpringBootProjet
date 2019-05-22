package application.controller;

import application.entity.Room;
import application.repository.RoomRepository;
import application.service.RoomService;
import application.serviceImpl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomController {

    @Autowired
    private RoomService roomService;

   // @RequestMapping(value = "/rooms", method = RequestMethod.GET)
   @CrossOrigin(origins = "*")
    @RequestMapping("/rooms")
    public List<Room> getAllRooms() {
        return roomService.findAllRooms();
    }

    @PostMapping("/rooms")
    public Room createRoom(@Valid @RequestBody Room room){
        return roomService.addRoom(room);
    }


}
