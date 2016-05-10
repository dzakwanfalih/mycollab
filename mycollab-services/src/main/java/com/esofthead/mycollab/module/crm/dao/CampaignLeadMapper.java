/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.crm.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.crm.domain.CampaignLead;
import com.esofthead.mycollab.module.crm.domain.CampaignLeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface CampaignLeadMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    int countByExample(CampaignLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    int deleteByExample(CampaignLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    int insert(CampaignLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    int insertSelective(CampaignLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    List<CampaignLead> selectByExample(CampaignLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    CampaignLead selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    int updateByExampleSelective(@Param("record") CampaignLead record, @Param("example") CampaignLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    int updateByExample(@Param("record") CampaignLead record, @Param("example") CampaignLeadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    int updateByPrimaryKeySelective(CampaignLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    int updateByPrimaryKey(CampaignLead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    Integer insertAndReturnKey(CampaignLead value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_campaigns_leads
     *
     * @mbggenerated Mon May 09 21:47:46 ICT 2016
     */
    void massUpdateWithSession(@Param("record") CampaignLead record, @Param("primaryKeys") List primaryKeys);
}