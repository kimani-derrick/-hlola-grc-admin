package I4;

import G4.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class c implements G4.f {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f1255a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f1255a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).a(f1255a.format((Date) obj));
    }
}
