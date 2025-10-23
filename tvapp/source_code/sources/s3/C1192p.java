package s3;

import android.accounts.AccountManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* renamed from: s3.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1192p extends AbstractC1195q0 {

    /* renamed from: s  reason: collision with root package name */
    public long f14171s;

    /* renamed from: t  reason: collision with root package name */
    public String f14172t;

    /* renamed from: u  reason: collision with root package name */
    public AccountManager f14173u;

    /* renamed from: v  reason: collision with root package name */
    public Boolean f14174v;

    /* renamed from: w  reason: collision with root package name */
    public long f14175w;

    @Override // s3.AbstractC1195q0
    public final boolean G() {
        Calendar calendar = Calendar.getInstance();
        this.f14171s = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f14172t = lowerCase + "-" + lowerCase2;
        return false;
    }
}
