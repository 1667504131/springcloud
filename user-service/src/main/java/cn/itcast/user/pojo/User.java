package cn.itcast.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: dongjw26541
 * @Date: 2019/3/14 17:48
 * @Version 1.0
 */
@Table(name = "textuser")
@Data
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer userid;

    private String username;

    private String usersex;

    private String usermome;

}
