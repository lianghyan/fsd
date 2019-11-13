package fsdcloudsvr;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	//net.fsd.user.UserControllerTest.class 
		net.fsd.security.LoginControllerTest.class
		,net.fsd.user.UserControllerTest.class 
		,net.fsd.payment.PaymentControllerTest.class
		,net.fsd.search.SearchControllerTest.class
		,net.fsd.search.UserTrainingControllerTest.class
		,net.fsd.skill.SkillControllerTests.class
		,net.fsd.training.TrainingControllerTest.class 
		})
public class TestSuit {

}
