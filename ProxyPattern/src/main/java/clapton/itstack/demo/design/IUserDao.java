package clapton.itstack.demo.design;

import clapton.itstack.demo.design.agent.Select;

public interface IUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}
