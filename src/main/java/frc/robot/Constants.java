package frc.robot;

public final class Constants {
    public static final double stickDeadband = 0.2;

    public static final class OIConstants {
        public static final int kDriverController = 0;
        public static final int kOperatorController = 1;
    }

    public static final class ArmConstants {
        public static final int kArmID = 13;
        public static final double kMaxAngle = 130;
        public static final double kAmpAngle = 100;
        public static final double kSpeakerAngle = 20;
        public static final double kSpeakerCloseAnlge = 32;
        public static final double kSpeakerMidAngle = 50;
        public static final double kSpeakerFarAngle = 58.75;
        public static final double kArmHomeAngle = 0;
        public static final double kYeetAngle = 50; //TODO: Tune this number at Mason
    }
    
}
