package d3;

import a.AbstractC0189a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.D;
import h3.AbstractC0748a;
import java.util.Arrays;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class b extends AbstractC0748a {

    /* renamed from: q  reason: collision with root package name */
    public final int f9219q;

    /* renamed from: r  reason: collision with root package name */
    public final int f9220r;

    /* renamed from: s  reason: collision with root package name */
    public final PendingIntent f9221s;

    /* renamed from: t  reason: collision with root package name */
    public final String f9222t;

    /* renamed from: u  reason: collision with root package name */
    public static final b f9218u = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(15);

    public b(int i7) {
        this(1, i7, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f9220r == bVar.f9220r && g3.n.j(this.f9221s, bVar.f9221s) && g3.n.j(this.f9222t, bVar.f9222t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9220r), this.f9221s, this.f9222t});
    }

    public final String toString() {
        String str;
        D d = new D(this);
        int i7 = this.f9220r;
        if (i7 != 99) {
            if (i7 != 1500) {
                switch (i7) {
                    case -1:
                        str = "UNKNOWN";
                        break;
                    case 0:
                        str = "SUCCESS";
                        break;
                    case 1:
                        str = "SERVICE_MISSING";
                        break;
                    case 2:
                        str = "SERVICE_VERSION_UPDATE_REQUIRED";
                        break;
                    case 3:
                        str = "SERVICE_DISABLED";
                        break;
                    case 4:
                        str = "SIGN_IN_REQUIRED";
                        break;
                    case 5:
                        str = "INVALID_ACCOUNT";
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "RESOLUTION_REQUIRED";
                        break;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "NETWORK_ERROR";
                        break;
                    case 8:
                        str = "INTERNAL_ERROR";
                        break;
                    case 9:
                        str = "SERVICE_INVALID";
                        break;
                    case 10:
                        str = "DEVELOPER_ERROR";
                        break;
                    case 11:
                        str = "LICENSE_CHECK_FAILED";
                        break;
                    default:
                        switch (i7) {
                            case 13:
                                str = "CANCELED";
                                break;
                            case 14:
                                str = "TIMEOUT";
                                break;
                            case 15:
                                str = "INTERRUPTED";
                                break;
                            case 16:
                                str = "API_UNAVAILABLE";
                                break;
                            case 17:
                                str = "SIGN_IN_FAILED";
                                break;
                            case 18:
                                str = "SERVICE_UPDATING";
                                break;
                            case 19:
                                str = "SERVICE_MISSING_PERMISSION";
                                break;
                            case 20:
                                str = "RESTRICTED_PROFILE";
                                break;
                            case 21:
                                str = "API_VERSION_UPDATE_REQUIRED";
                                break;
                            case 22:
                                str = "RESOLUTION_ACTIVITY_NOT_FOUND";
                                break;
                            case 23:
                                str = "API_DISABLED";
                                break;
                            case 24:
                                str = "API_DISABLED_FOR_CONNECTION";
                                break;
                            default:
                                str = AbstractC1111a.n(i7, "UNKNOWN_ERROR_CODE(", ")");
                                break;
                        }
                }
            } else {
                str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            }
        } else {
            str = "UNFINISHED";
        }
        d.c(str, "statusCode");
        d.c(this.f9221s, "resolution");
        d.c(this.f9222t, "message");
        return d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.R(parcel, 1, 4);
        parcel.writeInt(this.f9219q);
        AbstractC0189a.R(parcel, 2, 4);
        parcel.writeInt(this.f9220r);
        AbstractC0189a.L(parcel, 3, this.f9221s, i7);
        AbstractC0189a.M(parcel, 4, this.f9222t);
        AbstractC0189a.Q(parcel, P6);
    }

    public b(int i7, int i8, PendingIntent pendingIntent, String str) {
        this.f9219q = i7;
        this.f9220r = i8;
        this.f9221s = pendingIntent;
        this.f9222t = str;
    }

    public b(int i7, PendingIntent pendingIntent) {
        this(1, i7, pendingIntent, null);
    }
}
