package androidx.media;

import X.i;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Arrays;
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f6846a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f6847b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f6848c = 0;
    public int d = -1;

    public final boolean equals(Object obj) {
        int i7;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f6847b == audioAttributesImplBase.f6847b) {
            int i8 = this.f6848c;
            int i9 = audioAttributesImplBase.f6848c;
            int i10 = audioAttributesImplBase.d;
            if (i10 != -1) {
                i7 = i10;
            } else {
                int i11 = audioAttributesImplBase.f6846a;
                int i12 = AudioAttributesCompat.f6842b;
                if ((i9 & 1) == 1) {
                    i7 = 7;
                } else if ((i9 & 4) == 4) {
                    i7 = 6;
                } else {
                    switch (i11) {
                        case 2:
                            i7 = 0;
                            break;
                        case 3:
                            i7 = 8;
                            break;
                        case 4:
                            i7 = 4;
                            break;
                        case 5:
                        case i.DOUBLE_FIELD_NUMBER /* 7 */:
                        case 8:
                        case 9:
                        case 10:
                            i7 = 5;
                            break;
                        case i.STRING_SET_FIELD_NUMBER /* 6 */:
                            i7 = 2;
                            break;
                        case 11:
                            i7 = 10;
                            break;
                        case 12:
                        default:
                            i7 = 3;
                            break;
                        case 13:
                            i7 = 1;
                            break;
                    }
                }
            }
            if (i7 == 6) {
                i9 |= 4;
            } else if (i7 == 7) {
                i9 |= 1;
            }
            if (i8 == (i9 & 273) && this.f6846a == audioAttributesImplBase.f6846a && this.d == i10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6847b), Integer.valueOf(this.f6848c), Integer.valueOf(this.f6846a), Integer.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i7 = this.f6846a;
        int i8 = AudioAttributesCompat.f6842b;
        switch (i7) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = AbstractC0515y1.l("unknown usage ", i7);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f6847b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f6848c).toUpperCase());
        return sb.toString();
    }
}
