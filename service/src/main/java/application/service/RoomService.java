package application.service;

import application.entity.Room;
import application.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    private List<Room> findAllRooms() {
        return (List<Room>) roomRepository.findAll();
    }

    private Room findRoomById(long id) {
        return roomRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    private void deleteRoom(long id) {
        roomRepository.deleteById(id);
    }

    private void addRoom(Room room) {
        roomRepository.save(room);
    }

    private void updateRoom(long id, Room roomDetail) {
        Room room = findRoomById(id);
        room.setImage(roomDetail.getImage());
        room.setName(roomDetail.getName());
        room.setSeatCount(roomDetail.getSeatCount());
        room.setPrice(roomDetail.getPrice());
    }
}
