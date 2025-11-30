package sp.main;

import java.awt.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import sp.main.Dao.UserRepository;
import sp.main.Entity.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext con = SpringApplication.run(Application.class, args);

		UserRepository userRepository = con.getBean(UserRepository.class);

//		User user = new User();
//		user.setName("Naman");
//		user.setCity("BLR");
//
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
		//----------------insert--------
		
		User user1 = new User();
		user1.setName("akash");
		user1.setCity("Gujju");
		
		User user3 = new User();
		user3.setName("ashim");
		user3.setCity("kashmir");
		
		  //saving single user
//		 User resultUser = userRepository.save(user3);
//		 System.out.println(resultUser);
		 
		//saving multiple ones
//		java.util.List<User> users = List.of(user1,user3);
//		Iterable<User> result = userRepository.saveAll(users);
		
		
//------------- Update -----------------------
		
//		 Optional<User> optional =userRepository.findById(2);
//		 User user = optional.get();
//		 user.setCity("Indore");
//		 User result = userRepository.save(user);
//		 System.out.println(result);
		
		 
	
//------------read or get the data-----------
		 
		 // first one is findbyId(id) - returns optional Containing your data
		 
//		 Iterable<User> itr = userRepository.findAll();
//		 itr.forEach(user -> System.out.println(user));
		 
//----------------deleting the user element-------------
		 
		//delete by id
		
//		userRepository.deleteById(2);
//		System.out.println("deleted");
		
		// delete all users
//		Iterable<User> allusers = userRepository.findAll();
//		userRepository.deleteAll(allusers);
		
		
	//---------------Custom methods-----------------
		
		java.util.List<User> users = userRepository.findByName("akash");
		users.forEach(e-> System.out.println(e));
		
		 
	}

}
