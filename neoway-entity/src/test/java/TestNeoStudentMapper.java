import com.neo.common.model.Student;
import com.neo.dao.NeoStudentMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 20130702224 on 2017/10/18.
 */
public class TestNeoStudentMapper extends SpringTestCaseBase {

    @Autowired
    private NeoStudentMapper neoStudentMapper;


    @Test
    public void test_findById(){
//        System.out.println("test");
        Student student = neoStudentMapper.findById(1);
        System.out.println(student.getName());
    }

    @Test
    public void test_findAllStudents(){

        List<Student> students = neoStudentMapper.findAllStudents();
        for (Student s:students
             ) {
            System.out.println(s.getName());
        }

    }



    @Override
    public void setUp() {

    }

    @Override
    public void tearDown() {

    }
}
