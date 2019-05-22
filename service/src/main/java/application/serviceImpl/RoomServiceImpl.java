package application.serviceImpl;

import application.entity.Room;
import application.repository.RoomRepository;
import application.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;


    @Override
    public List<Room> findAllRooms() {
        return (List<Room>) roomRepository.findAll();
    }

    @Override
    public Room findRoomById(long id) {
        return roomRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public void deleteRoom(long id) {
        roomRepository.deleteById(id);
    }

    @Override
    public Room addRoom(Room room) {
       return roomRepository.save(room);
    }

    @Override
    public void updateRoom(long id, Room roomDetail) {
        Room room = findRoomById(id);
        room.setImage(roomDetail.getImage());
        room.setName(roomDetail.getName());
        room.setSeatCount(roomDetail.getSeatCount());
        room.setPrice(roomDetail.getPrice());
    }

}
