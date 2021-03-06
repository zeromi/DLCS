package com.ruoyi.project.equipment.mapper;

import com.ruoyi.project.equipment.domain.EquFacemachine;

import java.util.List;

/**
 * 人脸设备信息Mapper接口
 *
 * @author ruoyi
 * @date 2020-10-19
 */
public interface EquFacemachineMapper
{
    /**
     * 查询人脸设备信息
     *
     * @param faceId 人脸设备信息ID
     * @return 人脸设备信息
     */
    public EquFacemachine selectEquFacemachineById(Long faceId);

    /**
     * 查询人脸设备信息列表
     *
     * @param equFacemachine 人脸设备信息
     * @return 人脸设备信息集合
     */
    public List<EquFacemachine> selectEquFacemachineList(EquFacemachine equFacemachine);

    /**
     * 新增人脸设备信息
     *
     * @param equFacemachine 人脸设备信息
     * @return 结果
     */
    public int insertEquFacemachine(EquFacemachine equFacemachine);

    /**
     * 修改人脸设备信息
     *
     * @param equFacemachine 人脸设备信息
     * @return 结果
     */
    public int updateEquFacemachine(EquFacemachine equFacemachine);

    /**
     * 删除人脸设备信息
     *
     * @param faceId 人脸设备信息ID
     * @return 结果
     */
    public int deleteEquFacemachineById(Long faceId);

    /**
     * 批量删除人脸设备信息
     *
     * @param faceIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteEquFacemachineByIds(Long[] faceIds);
}
