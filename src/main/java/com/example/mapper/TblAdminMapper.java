package com.example.mapper;

import com.example.entity.TblAdmin;
import com.example.entity.TblAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_admin
     *
     * @mbg.generated Thu May 07 12:42:38 ICT 2020
     */
    long countByExample(TblAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_admin
     *
     * @mbg.generated Thu May 07 12:42:38 ICT 2020
     */
    int deleteByExample(TblAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_admin
     *
     * @mbg.generated Thu May 07 12:42:38 ICT 2020
     */
    int deleteByPrimaryKey(String adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_admin
     *
     * @mbg.generated Thu May 07 12:42:38 ICT 2020
     */
    int insert(TblAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_admin
     *
     * @mbg.generated Thu May 07 12:42:38 ICT 2020
     */
    int insertSelective(TblAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_admin
     *
     * @mbg.generated Thu May 07 12:42:38 ICT 2020
     */
    List<TblAdmin> selectByExample(TblAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_admin
     *
     * @mbg.generated Thu May 07 12:42:38 ICT 2020
     */
    TblAdmin selectByPrimaryKey(String adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_admin
     *
     * @mbg.generated Thu May 07 12:42:38 ICT 2020
     */
    int updateByExampleSelective(@Param("record") TblAdmin record, @Param("example") TblAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_admin
     *
     * @mbg.generated Thu May 07 12:42:38 ICT 2020
     */
    int updateByExample(@Param("record") TblAdmin record, @Param("example") TblAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_admin
     *
     * @mbg.generated Thu May 07 12:42:38 ICT 2020
     */
    int updateByPrimaryKeySelective(TblAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_admin
     *
     * @mbg.generated Thu May 07 12:42:38 ICT 2020
     */
    int updateByPrimaryKey(TblAdmin record);
    
    TblAdmin Login(String adminId,String password);
}