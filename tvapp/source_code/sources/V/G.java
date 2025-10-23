package V;

import java.io.File;
import java.io.FileOutputStream;
/* loaded from: classes.dex */
public final class G extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public H f3518t;

    /* renamed from: u  reason: collision with root package name */
    public File f3519u;

    /* renamed from: v  reason: collision with root package name */
    public FileOutputStream f3520v;

    /* renamed from: w  reason: collision with root package name */
    public FileOutputStream f3521w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f3522x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ H f3523y;

    /* renamed from: z  reason: collision with root package name */
    public int f3524z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h7, D5.d dVar) {
        super(dVar);
        this.f3523y = h7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f3522x = obj;
        this.f3524z |= Integer.MIN_VALUE;
        return this.f3523y.i(this, null);
    }
}
