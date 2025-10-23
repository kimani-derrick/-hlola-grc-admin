package i4;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import l4.C0973a;
/* renamed from: i4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773b {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f11365g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    public static final SimpleDateFormat f11366h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    public final String f11367a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11368b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11369c;
    public final Date d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11370e;
    public final long f;

    public C0773b(String str, String str2, String str3, Date date, long j7, long j8) {
        this.f11367a = str;
        this.f11368b = str2;
        this.f11369c = str3;
        this.d = date;
        this.f11370e = j7;
        this.f = j8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l4.a] */
    public final C0973a a(String str) {
        ?? obj = new Object();
        obj.f12253a = str;
        obj.f12263m = this.d.getTime();
        obj.f12254b = this.f11367a;
        obj.f12255c = this.f11368b;
        String str2 = this.f11369c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        obj.d = str2;
        obj.f12256e = this.f11370e;
        obj.f12260j = this.f;
        return obj;
    }
}
