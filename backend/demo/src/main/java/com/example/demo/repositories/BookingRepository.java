package com.example.demo.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.Booking;
@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {
    public Booking findByBookingId(String bookingId);
}