package by.danilakuzin.schoolApplication.repositories;

import by.danilakuzin.schoolApplication.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonsRepository extends JpaRepository<Lesson, Long> {
}
