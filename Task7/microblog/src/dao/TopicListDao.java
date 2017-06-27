package dao;

import java.util.List;
import java.util.Map;

import entity.Topic;
import entity.Users;

public interface TopicListDao {
	
	/**
	 * ��ȡ���е�΢��
	 * @return
	 */
	List<Topic> getMeAndAllFriendTopic();
	
	/**
	 * ȡ�������޵�����
	 * @return
	 */
	int getPraiseCount(int topicId);
	
	/**
	 * ��ȡ���е����˵�����
	 * @return
	 */
	List<Users> getPraisePeopleName(int topicId);
	

}
