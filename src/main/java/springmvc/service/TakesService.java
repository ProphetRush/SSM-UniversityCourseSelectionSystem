package springmvc.service;

import org.apache.ibatis.annotations.Param;
import springmvc.pojo.Section;
import springmvc.pojo.Takes;

import java.util.HashMap;
import java.util.List;

public interface TakesService {
    List<Takes> studentTakes(String stuID);
    void selectSection(String stuID, String course_id, String sec_id, String semester, int year);
    Boolean isSelected(String stuID, String course_id, String sec_id, String semester, int year);
    Takes get(String stuID, String course_id, String sec_id, String semester, int year);
//    String[] getSelectedCourseID(String stuID);
    Boolean isCapacityEnough(Section section);
    HashMap<String, String> getStuGrades(String stuID);
}
