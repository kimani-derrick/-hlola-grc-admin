package b0;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: A  reason: collision with root package name */
    public static final byte[] f7009A;

    /* renamed from: B  reason: collision with root package name */
    public static final String[] f7010B;

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f7011C;

    /* renamed from: D  reason: collision with root package name */
    public static final byte[] f7012D;

    /* renamed from: E  reason: collision with root package name */
    public static final C0352d f7013E;
    public static final C0352d[][] F;

    /* renamed from: G  reason: collision with root package name */
    public static final C0352d[] f7014G;

    /* renamed from: H  reason: collision with root package name */
    public static final HashMap[] f7015H;

    /* renamed from: I  reason: collision with root package name */
    public static final HashMap[] f7016I;

    /* renamed from: J  reason: collision with root package name */
    public static final HashSet f7017J;

    /* renamed from: K  reason: collision with root package name */
    public static final HashMap f7018K;

    /* renamed from: L  reason: collision with root package name */
    public static final Charset f7019L;

    /* renamed from: M  reason: collision with root package name */
    public static final byte[] f7020M;

    /* renamed from: N  reason: collision with root package name */
    public static final byte[] f7021N;

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f7022l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f7023m;
    public static final int[] n;

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f7024o;

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f7025p;

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f7026q;

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f7027r;

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f7028s;

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f7029t;

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f7030u;

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f7031v;

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f7032w;

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f7033x;

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f7034y;

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f7035z;

    /* renamed from: a  reason: collision with root package name */
    public final FileDescriptor f7036a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager.AssetInputStream f7037b;

    /* renamed from: c  reason: collision with root package name */
    public int f7038c;
    public final HashMap[] d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f7039e;
    public ByteOrder f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7040g;

    /* renamed from: h  reason: collision with root package name */
    public int f7041h;

    /* renamed from: i  reason: collision with root package name */
    public int f7042i;

    /* renamed from: j  reason: collision with root package name */
    public int f7043j;

    /* renamed from: k  reason: collision with root package name */
    public int f7044k;

    static {
        C0352d[] c0352dArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f7023m = new int[]{8, 8, 8};
        n = new int[]{8};
        f7024o = new byte[]{-1, -40, -1};
        f7025p = new byte[]{102, 116, 121, 112};
        f7026q = new byte[]{109, 105, 102, 49};
        f7027r = new byte[]{104, 101, 105, 99};
        f7028s = new byte[]{79, 76, 89, 77, 80, 0};
        f7029t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f7030u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f7031v = new byte[]{101, 88, 73, 102};
        f7032w = new byte[]{73, 72, 68, 82};
        f7033x = new byte[]{73, 69, 78, 68};
        f7034y = new byte[]{82, 73, 70, 70};
        f7035z = new byte[]{87, 69, 66, 80};
        f7009A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f7010B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f7011C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f7012D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C0352d[] c0352dArr2 = {new C0352d(254, 4, "NewSubfileType"), new C0352d(255, 4, "SubfileType"), new C0352d("ImageWidth", 256, 3, 4), new C0352d("ImageLength", 257, 3, 4), new C0352d(258, 3, "BitsPerSample"), new C0352d(259, 3, "Compression"), new C0352d(262, 3, "PhotometricInterpretation"), new C0352d(270, 2, "ImageDescription"), new C0352d(271, 2, "Make"), new C0352d(272, 2, "Model"), new C0352d("StripOffsets", 273, 3, 4), new C0352d(274, 3, "Orientation"), new C0352d(277, 3, "SamplesPerPixel"), new C0352d("RowsPerStrip", 278, 3, 4), new C0352d("StripByteCounts", 279, 3, 4), new C0352d(282, 5, "XResolution"), new C0352d(283, 5, "YResolution"), new C0352d(284, 3, "PlanarConfiguration"), new C0352d(296, 3, "ResolutionUnit"), new C0352d(301, 3, "TransferFunction"), new C0352d(305, 2, "Software"), new C0352d(306, 2, "DateTime"), new C0352d(315, 2, "Artist"), new C0352d(318, 5, "WhitePoint"), new C0352d(319, 5, "PrimaryChromaticities"), new C0352d(330, 4, "SubIFDPointer"), new C0352d(513, 4, "JPEGInterchangeFormat"), new C0352d(514, 4, "JPEGInterchangeFormatLength"), new C0352d(529, 5, "YCbCrCoefficients"), new C0352d(530, 3, "YCbCrSubSampling"), new C0352d(531, 3, "YCbCrPositioning"), new C0352d(532, 5, "ReferenceBlackWhite"), new C0352d(33432, 2, "Copyright"), new C0352d(34665, 4, "ExifIFDPointer"), new C0352d(34853, 4, "GPSInfoIFDPointer"), new C0352d(4, 4, "SensorTopBorder"), new C0352d(5, 4, "SensorLeftBorder"), new C0352d(6, 4, "SensorBottomBorder"), new C0352d(7, 4, "SensorRightBorder"), new C0352d(23, 3, "ISO"), new C0352d(46, 7, "JpgFromRaw"), new C0352d(700, 1, "Xmp")};
        f7013E = new C0352d(273, 3, "StripOffsets");
        F = new C0352d[][]{c0352dArr2, new C0352d[]{new C0352d(33434, 5, "ExposureTime"), new C0352d(33437, 5, "FNumber"), new C0352d(34850, 3, "ExposureProgram"), new C0352d(34852, 2, "SpectralSensitivity"), new C0352d(34855, 3, "PhotographicSensitivity"), new C0352d(34856, 7, "OECF"), new C0352d(34864, 3, "SensitivityType"), new C0352d(34865, 4, "StandardOutputSensitivity"), new C0352d(34866, 4, "RecommendedExposureIndex"), new C0352d(34867, 4, "ISOSpeed"), new C0352d(34868, 4, "ISOSpeedLatitudeyyy"), new C0352d(34869, 4, "ISOSpeedLatitudezzz"), new C0352d(36864, 2, "ExifVersion"), new C0352d(36867, 2, "DateTimeOriginal"), new C0352d(36868, 2, "DateTimeDigitized"), new C0352d(36880, 2, "OffsetTime"), new C0352d(36881, 2, "OffsetTimeOriginal"), new C0352d(36882, 2, "OffsetTimeDigitized"), new C0352d(37121, 7, "ComponentsConfiguration"), new C0352d(37122, 5, "CompressedBitsPerPixel"), new C0352d(37377, 10, "ShutterSpeedValue"), new C0352d(37378, 5, "ApertureValue"), new C0352d(37379, 10, "BrightnessValue"), new C0352d(37380, 10, "ExposureBiasValue"), new C0352d(37381, 5, "MaxApertureValue"), new C0352d(37382, 5, "SubjectDistance"), new C0352d(37383, 3, "MeteringMode"), new C0352d(37384, 3, "LightSource"), new C0352d(37385, 3, "Flash"), new C0352d(37386, 5, "FocalLength"), new C0352d(37396, 3, "SubjectArea"), new C0352d(37500, 7, "MakerNote"), new C0352d(37510, 7, "UserComment"), new C0352d(37520, 2, "SubSecTime"), new C0352d(37521, 2, "SubSecTimeOriginal"), new C0352d(37522, 2, "SubSecTimeDigitized"), new C0352d(40960, 7, "FlashpixVersion"), new C0352d(40961, 3, "ColorSpace"), new C0352d("PixelXDimension", 40962, 3, 4), new C0352d("PixelYDimension", 40963, 3, 4), new C0352d(40964, 2, "RelatedSoundFile"), new C0352d(40965, 4, "InteroperabilityIFDPointer"), new C0352d(41483, 5, "FlashEnergy"), new C0352d(41484, 7, "SpatialFrequencyResponse"), new C0352d(41486, 5, "FocalPlaneXResolution"), new C0352d(41487, 5, "FocalPlaneYResolution"), new C0352d(41488, 3, "FocalPlaneResolutionUnit"), new C0352d(41492, 3, "SubjectLocation"), new C0352d(41493, 5, "ExposureIndex"), new C0352d(41495, 3, "SensingMethod"), new C0352d(41728, 7, "FileSource"), new C0352d(41729, 7, "SceneType"), new C0352d(41730, 7, "CFAPattern"), new C0352d(41985, 3, "CustomRendered"), new C0352d(41986, 3, "ExposureMode"), new C0352d(41987, 3, "WhiteBalance"), new C0352d(41988, 5, "DigitalZoomRatio"), new C0352d(41989, 3, "FocalLengthIn35mmFilm"), new C0352d(41990, 3, "SceneCaptureType"), new C0352d(41991, 3, "GainControl"), new C0352d(41992, 3, "Contrast"), new C0352d(41993, 3, "Saturation"), new C0352d(41994, 3, "Sharpness"), new C0352d(41995, 7, "DeviceSettingDescription"), new C0352d(41996, 3, "SubjectDistanceRange"), new C0352d(42016, 2, "ImageUniqueID"), new C0352d(42032, 2, "CameraOwnerName"), new C0352d(42033, 2, "BodySerialNumber"), new C0352d(42034, 5, "LensSpecification"), new C0352d(42035, 2, "LensMake"), new C0352d(42036, 2, "LensModel"), new C0352d(42240, 5, "Gamma"), new C0352d(50706, 1, "DNGVersion"), new C0352d("DefaultCropSize", 50720, 3, 4)}, new C0352d[]{new C0352d(0, 1, "GPSVersionID"), new C0352d(1, 2, "GPSLatitudeRef"), new C0352d("GPSLatitude", 2, 5, 10), new C0352d(3, 2, "GPSLongitudeRef"), new C0352d("GPSLongitude", 4, 5, 10), new C0352d(5, 1, "GPSAltitudeRef"), new C0352d(6, 5, "GPSAltitude"), new C0352d(7, 5, "GPSTimeStamp"), new C0352d(8, 2, "GPSSatellites"), new C0352d(9, 2, "GPSStatus"), new C0352d(10, 2, "GPSMeasureMode"), new C0352d(11, 5, "GPSDOP"), new C0352d(12, 2, "GPSSpeedRef"), new C0352d(13, 5, "GPSSpeed"), new C0352d(14, 2, "GPSTrackRef"), new C0352d(15, 5, "GPSTrack"), new C0352d(16, 2, "GPSImgDirectionRef"), new C0352d(17, 5, "GPSImgDirection"), new C0352d(18, 2, "GPSMapDatum"), new C0352d(19, 2, "GPSDestLatitudeRef"), new C0352d(20, 5, "GPSDestLatitude"), new C0352d(21, 2, "GPSDestLongitudeRef"), new C0352d(22, 5, "GPSDestLongitude"), new C0352d(23, 2, "GPSDestBearingRef"), new C0352d(24, 5, "GPSDestBearing"), new C0352d(25, 2, "GPSDestDistanceRef"), new C0352d(26, 5, "GPSDestDistance"), new C0352d(27, 7, "GPSProcessingMethod"), new C0352d(28, 7, "GPSAreaInformation"), new C0352d(29, 2, "GPSDateStamp"), new C0352d(30, 3, "GPSDifferential"), new C0352d(31, 5, "GPSHPositioningError")}, new C0352d[]{new C0352d(1, 2, "InteroperabilityIndex")}, new C0352d[]{new C0352d(254, 4, "NewSubfileType"), new C0352d(255, 4, "SubfileType"), new C0352d("ThumbnailImageWidth", 256, 3, 4), new C0352d("ThumbnailImageLength", 257, 3, 4), new C0352d(258, 3, "BitsPerSample"), new C0352d(259, 3, "Compression"), new C0352d(262, 3, "PhotometricInterpretation"), new C0352d(270, 2, "ImageDescription"), new C0352d(271, 2, "Make"), new C0352d(272, 2, "Model"), new C0352d("StripOffsets", 273, 3, 4), new C0352d(274, 3, "ThumbnailOrientation"), new C0352d(277, 3, "SamplesPerPixel"), new C0352d("RowsPerStrip", 278, 3, 4), new C0352d("StripByteCounts", 279, 3, 4), new C0352d(282, 5, "XResolution"), new C0352d(283, 5, "YResolution"), new C0352d(284, 3, "PlanarConfiguration"), new C0352d(296, 3, "ResolutionUnit"), new C0352d(301, 3, "TransferFunction"), new C0352d(305, 2, "Software"), new C0352d(306, 2, "DateTime"), new C0352d(315, 2, "Artist"), new C0352d(318, 5, "WhitePoint"), new C0352d(319, 5, "PrimaryChromaticities"), new C0352d(330, 4, "SubIFDPointer"), new C0352d(513, 4, "JPEGInterchangeFormat"), new C0352d(514, 4, "JPEGInterchangeFormatLength"), new C0352d(529, 5, "YCbCrCoefficients"), new C0352d(530, 3, "YCbCrSubSampling"), new C0352d(531, 3, "YCbCrPositioning"), new C0352d(532, 5, "ReferenceBlackWhite"), new C0352d(33432, 2, "Copyright"), new C0352d(34665, 4, "ExifIFDPointer"), new C0352d(34853, 4, "GPSInfoIFDPointer"), new C0352d(50706, 1, "DNGVersion"), new C0352d("DefaultCropSize", 50720, 3, 4)}, c0352dArr2, new C0352d[]{new C0352d(256, 7, "ThumbnailImage"), new C0352d(8224, 4, "CameraSettingsIFDPointer"), new C0352d(8256, 4, "ImageProcessingIFDPointer")}, new C0352d[]{new C0352d(257, 4, "PreviewImageStart"), new C0352d(258, 4, "PreviewImageLength")}, new C0352d[]{new C0352d(4371, 3, "AspectFrame")}, new C0352d[]{new C0352d(55, 3, "ColorSpace")}};
        f7014G = new C0352d[]{new C0352d(330, 4, "SubIFDPointer"), new C0352d(34665, 4, "ExifIFDPointer"), new C0352d(34853, 4, "GPSInfoIFDPointer"), new C0352d(40965, 4, "InteroperabilityIFDPointer"), new C0352d(8224, 1, "CameraSettingsIFDPointer"), new C0352d(8256, 1, "ImageProcessingIFDPointer")};
        f7015H = new HashMap[10];
        f7016I = new HashMap[10];
        f7017J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f7018K = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f7019L = forName;
        f7020M = "Exif\u0000\u0000".getBytes(forName);
        f7021N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i7 = 0;
        while (true) {
            C0352d[][] c0352dArr3 = F;
            if (i7 < c0352dArr3.length) {
                f7015H[i7] = new HashMap();
                f7016I[i7] = new HashMap();
                for (C0352d c0352d : c0352dArr3[i7]) {
                    f7015H[i7].put(Integer.valueOf(c0352d.f7004a), c0352d);
                    f7016I[i7].put(c0352d.f7005b, c0352d);
                }
                i7++;
            } else {
                HashMap hashMap = f7018K;
                C0352d[] c0352dArr4 = f7014G;
                hashMap.put(Integer.valueOf(c0352dArr4[0].f7004a), 5);
                hashMap.put(Integer.valueOf(c0352dArr4[1].f7004a), 1);
                hashMap.put(Integer.valueOf(c0352dArr4[2].f7004a), 2);
                hashMap.put(Integer.valueOf(c0352dArr4[3].f7004a), 3);
                hashMap.put(Integer.valueOf(c0352dArr4[4].f7004a), 7);
                hashMap.put(Integer.valueOf(c0352dArr4[5].f7004a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[Catch: all -> 0x005d, UnsupportedOperationException -> 0x0060, IOException -> 0x0063, LOOP:0: B:64:0x004e->B:17:0x0051, LOOP_END, TryCatch #2 {all -> 0x005d, blocks: (B:15:0x004e, B:17:0x0051, B:24:0x0066, B:30:0x0083, B:32:0x008e, B:40:0x00a4, B:35:0x0095, B:38:0x009d, B:39:0x00a1, B:41:0x00ae, B:43:0x00b7, B:45:0x00bd, B:47:0x00c3, B:49:0x00c9, B:54:0x00d7), top: B:64:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x005d, UnsupportedOperationException -> 0x0060, IOException -> 0x0063, TryCatch #2 {all -> 0x005d, blocks: (B:15:0x004e, B:17:0x0051, B:24:0x0066, B:30:0x0083, B:32:0x008e, B:40:0x00a4, B:35:0x0095, B:38:0x009d, B:39:0x00a1, B:41:0x00ae, B:43:0x00b7, B:45:0x00bd, B:47:0x00c3, B:49:0x00c9, B:54:0x00d7), top: B:64:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7 A[Catch: all -> 0x005d, UnsupportedOperationException -> 0x0060, IOException -> 0x0063, TryCatch #2 {all -> 0x005d, blocks: (B:15:0x004e, B:17:0x0051, B:24:0x0066, B:30:0x0083, B:32:0x008e, B:40:0x00a4, B:35:0x0095, B:38:0x009d, B:39:0x00a1, B:41:0x00ae, B:43:0x00b7, B:45:0x00bd, B:47:0x00c3, B:49:0x00c9, B:54:0x00d7), top: B:64:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:15:0x004e, B:17:0x0051, B:24:0x0066, B:30:0x0083, B:32:0x008e, B:40:0x00a4, B:35:0x0095, B:38:0x009d, B:39:0x00a1, B:41:0x00ae, B:43:0x00b7, B:45:0x00bd, B:47:0x00c3, B:49:0x00c9, B:54:0x00d7), top: B:64:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(K0.h r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.<init>(K0.h):void");
    }

    public static ByteOrder q(C0350b c0350b) {
        short readShort = c0350b.readShort();
        boolean z7 = f7022l;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z7) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z7) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b7 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.d;
        if (b7 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b7.concat("\u0000").getBytes(f7019L);
            hashMap.put("DateTime", new C0351c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C0351c.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C0351c.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C0351c.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C0351c.a(0L, this.f));
        }
    }

    public final String b(String str) {
        String str2;
        C0351c c5 = c(str);
        if (c5 != null) {
            if (!f7017J.contains(str)) {
                return c5.f(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i7 = c5.f7001a;
                if (i7 != 5 && i7 != 10) {
                    str2 = "GPS Timestamp format is not rational. format=" + i7;
                } else {
                    C0353e[] c0353eArr = (C0353e[]) c5.g(this.f);
                    if (c0353eArr != null && c0353eArr.length == 3) {
                        C0353e c0353e = c0353eArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) c0353e.f7007a) / ((float) c0353e.f7008b)));
                        C0353e c0353e2 = c0353eArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) c0353e2.f7007a) / ((float) c0353e2.f7008b)));
                        C0353e c0353e3 = c0353eArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) c0353e3.f7007a) / ((float) c0353e3.f7008b))));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(c0353eArr);
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(c5.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C0351c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f7022l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i7 = 0; i7 < F.length; i7++) {
            C0351c c0351c = (C0351c) this.d[i7].get(str);
            if (c0351c != null) {
                return c0351c;
            }
        }
        return null;
    }

    public final void d(f fVar) {
        String str;
        String str2;
        String str3;
        int i7;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    i.a(mediaMetadataRetriever, new C0349a(fVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.d;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", C0351c.c(Integer.parseInt(str), this.f));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", C0351c.c(Integer.parseInt(str2), this.f));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i7 = 1;
                                } else {
                                    i7 = 8;
                                }
                            } else {
                                i7 = 3;
                            }
                        } else {
                            i7 = 6;
                        }
                        hashMapArr[0].put("Orientation", C0351c.c(i7, this.f));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.b(parseInt2);
                            byte[] bArr = new byte[6];
                            if (fVar.read(bArr) == 6) {
                                int i8 = parseInt2 + 6;
                                int i9 = parseInt3 - 6;
                                if (Arrays.equals(bArr, f7020M)) {
                                    byte[] bArr2 = new byte[i9];
                                    if (fVar.read(bArr2) == i9) {
                                        this.f7041h = i8;
                                        r(0, bArr2);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f7022l) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a1, code lost:
        r23.f6998r = r22.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a5, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018d A[LOOP:0: B:10:0x0034->B:82:0x018d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0195 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(b0.C0350b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.e(b0.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bf, code lost:
        if (r8 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0116 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.f(java.io.BufferedInputStream):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(b0.f r7) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.g(b0.f):void");
    }

    public final void h(C0350b c0350b) {
        if (f7022l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c0350b);
        }
        c0350b.f6998r = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f7030u;
        c0350b.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c0350b.readInt();
                byte[] bArr2 = new byte[4];
                if (c0350b.read(bArr2) == 4) {
                    int i7 = length + 8;
                    if (i7 == 16 && !Arrays.equals(bArr2, f7032w)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, f7033x)) {
                        if (Arrays.equals(bArr2, f7031v)) {
                            byte[] bArr3 = new byte[readInt];
                            if (c0350b.read(bArr3) == readInt) {
                                int readInt2 = c0350b.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f7041h = i7;
                                    r(0, bArr3);
                                    x();
                                    u(new C0350b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + m3.g.d(bArr2));
                        }
                        int i8 = readInt + 4;
                        c0350b.a(i8);
                        length = i7 + i8;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C0350b c0350b) {
        boolean z7 = f7022l;
        if (z7) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c0350b);
        }
        c0350b.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0350b.read(bArr);
        c0350b.read(bArr2);
        c0350b.read(bArr3);
        int i7 = ByteBuffer.wrap(bArr).getInt();
        int i8 = ByteBuffer.wrap(bArr2).getInt();
        int i9 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i8];
        c0350b.a(i7 - c0350b.f6999s);
        c0350b.read(bArr4);
        e(new C0350b(bArr4), i7, 5);
        c0350b.a(i9 - c0350b.f6999s);
        c0350b.f6998r = ByteOrder.BIG_ENDIAN;
        int readInt = c0350b.readInt();
        if (z7) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i10 = 0; i10 < readInt; i10++) {
            int readUnsignedShort = c0350b.readUnsignedShort();
            int readUnsignedShort2 = c0350b.readUnsignedShort();
            if (readUnsignedShort == f7013E.f7004a) {
                short readShort = c0350b.readShort();
                short readShort2 = c0350b.readShort();
                C0351c c5 = C0351c.c(readShort, this.f);
                C0351c c6 = C0351c.c(readShort2, this.f);
                HashMap[] hashMapArr = this.d;
                hashMapArr[0].put("ImageLength", c5);
                hashMapArr[0].put("ImageWidth", c6);
                if (z7) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c0350b.a(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f7038c == 8) {
            HashMap[] hashMapArr = this.d;
            C0351c c0351c = (C0351c) hashMapArr[1].get("MakerNote");
            if (c0351c != null) {
                f fVar2 = new f(c0351c.d);
                fVar2.f6998r = this.f;
                fVar2.a(6);
                s(fVar2, 9);
                C0351c c0351c2 = (C0351c) hashMapArr[9].get("ColorSpace");
                if (c0351c2 != null) {
                    hashMapArr[1].put("ColorSpace", c0351c2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (f7022l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.d;
        C0351c c0351c = (C0351c) hashMapArr[0].get("JpgFromRaw");
        if (c0351c != null) {
            e(new C0350b(c0351c.d), (int) c0351c.f7003c, 5);
        }
        C0351c c0351c2 = (C0351c) hashMapArr[0].get("ISO");
        C0351c c0351c3 = (C0351c) hashMapArr[1].get("PhotographicSensitivity");
        if (c0351c2 != null && c0351c3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", c0351c2);
        }
    }

    public final void l(C0350b c0350b) {
        if (f7022l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0350b);
        }
        c0350b.f6998r = ByteOrder.LITTLE_ENDIAN;
        c0350b.a(f7034y.length);
        int readInt = c0350b.readInt() + 8;
        byte[] bArr = f7035z;
        c0350b.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c0350b.read(bArr2) == 4) {
                    int readInt2 = c0350b.readInt();
                    int i7 = length + 8;
                    if (Arrays.equals(f7009A, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (c0350b.read(bArr3) == readInt2) {
                            this.f7041h = i7;
                            r(0, bArr3);
                            u(new C0350b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m3.g.d(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i7 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        c0350b.a(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C0350b c0350b, HashMap hashMap) {
        C0351c c0351c = (C0351c) hashMap.get("JPEGInterchangeFormat");
        C0351c c0351c2 = (C0351c) hashMap.get("JPEGInterchangeFormatLength");
        if (c0351c != null && c0351c2 != null) {
            int e3 = c0351c.e(this.f);
            int e7 = c0351c2.e(this.f);
            if (this.f7038c == 7) {
                e3 += this.f7042i;
            }
            if (e3 > 0 && e7 > 0 && this.f7037b == null && this.f7036a == null) {
                c0350b.skip(e3);
                c0350b.read(new byte[e7]);
            }
            if (f7022l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e3 + ", length: " + e7);
            }
        }
    }

    public final boolean n(HashMap hashMap) {
        C0351c c0351c = (C0351c) hashMap.get("ImageLength");
        C0351c c0351c2 = (C0351c) hashMap.get("ImageWidth");
        if (c0351c != null && c0351c2 != null) {
            int e3 = c0351c.e(this.f);
            int e7 = c0351c2.e(this.f);
            if (e3 <= 512 && e7 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(C0350b c0350b) {
        ByteOrder q5 = q(c0350b);
        this.f = q5;
        c0350b.f6998r = q5;
        int readUnsignedShort = c0350b.readUnsignedShort();
        int i7 = this.f7038c;
        if (i7 != 7 && i7 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c0350b.readInt();
        if (readInt >= 8) {
            int i8 = readInt - 8;
            if (i8 > 0) {
                c0350b.a(i8);
                return;
            }
            return;
        }
        throw new IOException(AbstractC0515y1.l("Invalid first Ifd offset: ", readInt));
    }

    public final void p() {
        int i7 = 0;
        while (true) {
            HashMap[] hashMapArr = this.d;
            if (i7 < hashMapArr.length) {
                StringBuilder o7 = AbstractC0515y1.o(i7, "The size of tag group[", "]: ");
                o7.append(hashMapArr[i7].size());
                Log.d("ExifInterface", o7.toString());
                for (Map.Entry entry : hashMapArr[i7].entrySet()) {
                    C0351c c0351c = (C0351c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c0351c.toString() + ", tagValue: '" + c0351c.f(this.f) + "'");
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void r(int i7, byte[] bArr) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(b0.f r29, int r30) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.s(b0.f, int):void");
    }

    public final void t(int i7, String str, String str2) {
        HashMap[] hashMapArr = this.d;
        if (!hashMapArr[i7].isEmpty() && hashMapArr[i7].get(str) != null) {
            HashMap hashMap = hashMapArr[i7];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i7].remove(str);
        }
    }

    public final void u(C0350b c0350b) {
        String str;
        String str2;
        StringBuilder sb;
        C0351c c0351c;
        int e3;
        HashMap hashMap = this.d[4];
        C0351c c0351c2 = (C0351c) hashMap.get("Compression");
        if (c0351c2 != null) {
            int e7 = c0351c2.e(this.f);
            if (e7 != 1) {
                if (e7 != 6) {
                    if (e7 != 7) {
                        return;
                    }
                } else {
                    m(c0350b, hashMap);
                    return;
                }
            }
            C0351c c0351c3 = (C0351c) hashMap.get("BitsPerSample");
            if (c0351c3 != null) {
                int[] iArr = (int[]) c0351c3.g(this.f);
                int[] iArr2 = f7023m;
                if (Arrays.equals(iArr2, iArr) || (this.f7038c == 3 && (c0351c = (C0351c) hashMap.get("PhotometricInterpretation")) != null && (((e3 = c0351c.e(this.f)) == 1 && Arrays.equals(iArr, n)) || (e3 == 6 && Arrays.equals(iArr, iArr2))))) {
                    C0351c c0351c4 = (C0351c) hashMap.get("StripOffsets");
                    C0351c c0351c5 = (C0351c) hashMap.get("StripByteCounts");
                    if (c0351c4 != null && c0351c5 != null) {
                        long[] g7 = m3.g.g(c0351c4.g(this.f));
                        long[] g8 = m3.g.g(c0351c5.g(this.f));
                        if (g7 != null && g7.length != 0) {
                            if (g8 != null && g8.length != 0) {
                                if (g7.length != g8.length) {
                                    str = "stripOffsets and stripByteCounts should have same length.";
                                } else {
                                    long j7 = 0;
                                    for (long j8 : g8) {
                                        j7 += j8;
                                    }
                                    byte[] bArr = new byte[(int) j7];
                                    this.f7040g = true;
                                    int i7 = 0;
                                    int i8 = 0;
                                    for (int i9 = 0; i9 < g7.length; i9++) {
                                        int i10 = (int) g7[i9];
                                        int i11 = (int) g8[i9];
                                        if (i9 < g7.length - 1 && i10 + i11 != g7[i9 + 1]) {
                                            this.f7040g = false;
                                        }
                                        int i12 = i10 - i7;
                                        if (i12 < 0) {
                                            str2 = "Invalid strip offset value";
                                        } else {
                                            long j9 = i12;
                                            if (c0350b.skip(j9) != j9) {
                                                sb = new StringBuilder("Failed to skip ");
                                                sb.append(i12);
                                            } else {
                                                int i13 = i7 + i12;
                                                byte[] bArr2 = new byte[i11];
                                                if (c0350b.read(bArr2) != i11) {
                                                    sb = new StringBuilder("Failed to read ");
                                                    sb.append(i11);
                                                } else {
                                                    i7 = i13 + i11;
                                                    System.arraycopy(bArr2, 0, bArr, i8, i11);
                                                    i8 += i11;
                                                }
                                            }
                                            sb.append(" bytes.");
                                            str2 = sb.toString();
                                        }
                                        Log.d("ExifInterface", str2);
                                        return;
                                    }
                                    if (this.f7040g) {
                                        long j10 = g7[0];
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                str = "stripByteCounts should not be null or have zero length.";
                            }
                        } else {
                            str = "stripOffsets should not be null or have zero length.";
                        }
                        Log.w("ExifInterface", str);
                        return;
                    }
                    return;
                }
            }
            if (f7022l) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        m(c0350b, hashMap);
    }

    public final void v(int i7, int i8) {
        String str;
        HashMap[] hashMapArr = this.d;
        boolean isEmpty = hashMapArr[i7].isEmpty();
        boolean z7 = f7022l;
        if (!isEmpty && !hashMapArr[i8].isEmpty()) {
            C0351c c0351c = (C0351c) hashMapArr[i7].get("ImageLength");
            C0351c c0351c2 = (C0351c) hashMapArr[i7].get("ImageWidth");
            C0351c c0351c3 = (C0351c) hashMapArr[i8].get("ImageLength");
            C0351c c0351c4 = (C0351c) hashMapArr[i8].get("ImageWidth");
            if (c0351c != null && c0351c2 != null) {
                if (c0351c3 != null && c0351c4 != null) {
                    int e3 = c0351c.e(this.f);
                    int e7 = c0351c2.e(this.f);
                    int e8 = c0351c3.e(this.f);
                    int e9 = c0351c4.e(this.f);
                    if (e3 < e8 && e7 < e9) {
                        HashMap hashMap = hashMapArr[i7];
                        hashMapArr[i7] = hashMapArr[i8];
                        hashMapArr[i8] = hashMap;
                        return;
                    }
                    return;
                } else if (z7) {
                    str = "Second image does not contain valid size information";
                } else {
                    return;
                }
            } else if (z7) {
                str = "First image does not contain valid size information";
            } else {
                return;
            }
            Log.d("ExifInterface", str);
        } else if (z7) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(f fVar, int i7) {
        StringBuilder sb;
        String arrays;
        C0351c c5;
        C0351c c6;
        HashMap[] hashMapArr = this.d;
        C0351c c0351c = (C0351c) hashMapArr[i7].get("DefaultCropSize");
        C0351c c0351c2 = (C0351c) hashMapArr[i7].get("SensorTopBorder");
        C0351c c0351c3 = (C0351c) hashMapArr[i7].get("SensorLeftBorder");
        C0351c c0351c4 = (C0351c) hashMapArr[i7].get("SensorBottomBorder");
        C0351c c0351c5 = (C0351c) hashMapArr[i7].get("SensorRightBorder");
        if (c0351c != null) {
            if (c0351c.f7001a == 5) {
                C0353e[] c0353eArr = (C0353e[]) c0351c.g(this.f);
                if (c0353eArr != null && c0353eArr.length == 2) {
                    c5 = C0351c.b(c0353eArr[0], this.f);
                    c6 = C0351c.b(c0353eArr[1], this.f);
                    hashMapArr[i7].put("ImageWidth", c5);
                    hashMapArr[i7].put("ImageLength", c6);
                    return;
                }
                sb = new StringBuilder("Invalid crop size values. cropSize=");
                arrays = Arrays.toString(c0353eArr);
                sb.append(arrays);
                Log.w("ExifInterface", sb.toString());
            }
            int[] iArr = (int[]) c0351c.g(this.f);
            if (iArr != null && iArr.length == 2) {
                c5 = C0351c.c(iArr[0], this.f);
                c6 = C0351c.c(iArr[1], this.f);
                hashMapArr[i7].put("ImageWidth", c5);
                hashMapArr[i7].put("ImageLength", c6);
                return;
            }
            sb = new StringBuilder("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(iArr);
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        } else if (c0351c2 != null && c0351c3 != null && c0351c4 != null && c0351c5 != null) {
            int e3 = c0351c2.e(this.f);
            int e7 = c0351c4.e(this.f);
            int e8 = c0351c5.e(this.f);
            int e9 = c0351c3.e(this.f);
            if (e7 > e3 && e8 > e9) {
                C0351c c7 = C0351c.c(e7 - e3, this.f);
                C0351c c8 = C0351c.c(e8 - e9, this.f);
                hashMapArr[i7].put("ImageLength", c7);
                hashMapArr[i7].put("ImageWidth", c8);
            }
        } else {
            C0351c c0351c6 = (C0351c) hashMapArr[i7].get("ImageLength");
            C0351c c0351c7 = (C0351c) hashMapArr[i7].get("ImageWidth");
            if (c0351c6 == null || c0351c7 == null) {
                C0351c c0351c8 = (C0351c) hashMapArr[i7].get("JPEGInterchangeFormat");
                C0351c c0351c9 = (C0351c) hashMapArr[i7].get("JPEGInterchangeFormatLength");
                if (c0351c8 != null && c0351c9 != null) {
                    int e10 = c0351c8.e(this.f);
                    int e11 = c0351c8.e(this.f);
                    fVar.b(e10);
                    byte[] bArr = new byte[e11];
                    fVar.read(bArr);
                    e(new C0350b(bArr), e10, i7);
                }
            }
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.d;
        C0351c c0351c = (C0351c) hashMapArr[1].get("PixelXDimension");
        C0351c c0351c2 = (C0351c) hashMapArr[1].get("PixelYDimension");
        if (c0351c != null && c0351c2 != null) {
            hashMapArr[0].put("ImageWidth", c0351c);
            hashMapArr[0].put("ImageLength", c0351c2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
