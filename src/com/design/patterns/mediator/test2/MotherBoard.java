package com.design.patterns.mediator.test2;

/**
 * 主板类，实现中介者接口
 * @author chenliangsen
 * @date 2019/12/18 10:46
 */
public class MotherBoard implements Mediator {
    /**
     * 需要知道交互的同事类--光驱类
     */
    private CDDriver cdDriver = null;
    /**
     * 需要知道要交互的同事类---CPU类
     */
    private CPU cpu = null;
    /**
     * 需要知道交互的同事类---显卡类
     */
    private VideoCard videoCard = null;
    /**
     * 需要知道要交互的同事类---声卡类
     */
    private SoundCard soundCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void changed(Colleague colleague) {
        if (colleague == cdDriver) {
            //表示光驱读取数据了
            this.openCDDriverReadData((CDDriver) colleague);
        }else if (colleague == cpu) {
            //表示CPU处理完了
            this.openCPU((CPU) colleague);
        }
    }

    /**
     *
     * @param colleague
     */
    private void openCPU(CPU colleague) {
        //1. 先获取CPU处理后的数据
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        //2.把这些数据传递给显卡和声卡显示出来
        this.videoCard.showData(videoData);
        this.soundCard.showData(soundData);
    }

    /**
     * 处理光驱读取数据以后与其他对象的交互
     * @param colleague 光驱同事对象
     */
    private void openCDDriverReadData(CDDriver colleague) {
        //1.先读取光驱读取的数据
        String data = cdDriver.getData();
        //2.把这些数据传递给CPU进行处理
        this.cpu.executeData(data);
    }
}
