package application.service;

import application.entity.Room;

import java.util.List;

public interface RoomService {
    List<Room> findAllRooms();
    Room findRoomById(long id);
    void deleteRoom(long id);
    Room addRoom(Room room);
    void updateRoom(long id, Room roomDetail);

}

