package b1;

import com.boxhdo.android.data.local.AppDatabase;
/* renamed from: b1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361h {

    /* renamed from: a  reason: collision with root package name */
    public final AppDatabase f7059a;

    /* renamed from: b  reason: collision with root package name */
    public final C0354a f7060b;

    /* renamed from: c  reason: collision with root package name */
    public final C0355b f7061c;

    public C0361h(AppDatabase appDatabase) {
        this.f7059a = appDatabase;
        this.f7060b = new C0354a(appDatabase, 2);
        this.f7061c = new C0355b(appDatabase, 4);
    }
}
