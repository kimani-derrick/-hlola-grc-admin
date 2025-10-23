package b1;

import com.boxhdo.android.data.local.AppDatabase;
/* renamed from: b1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356c {

    /* renamed from: a  reason: collision with root package name */
    public final AppDatabase f7045a;

    /* renamed from: b  reason: collision with root package name */
    public final C0354a f7046b;

    /* renamed from: c  reason: collision with root package name */
    public final C0355b f7047c;

    public C0356c(AppDatabase appDatabase) {
        this.f7045a = appDatabase;
        this.f7046b = new C0354a(appDatabase, 0);
        new C0355b(appDatabase, 0);
        this.f7047c = new C0355b(appDatabase, 1);
        new C0355b(appDatabase, 2);
    }
}
