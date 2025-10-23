package b1;

import com.boxhdo.android.data.local.AppDatabase;
/* renamed from: b1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358e {

    /* renamed from: a  reason: collision with root package name */
    public final AppDatabase f7051a;

    /* renamed from: b  reason: collision with root package name */
    public final C0354a f7052b;

    public C0358e(AppDatabase appDatabase) {
        this.f7051a = appDatabase;
        this.f7052b = new C0354a(appDatabase, 1);
        new C0355b(appDatabase, 3);
    }
}
