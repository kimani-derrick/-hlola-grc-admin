package H;

import android.content.Context;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f782a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f783b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f784c;
    public final /* synthetic */ e d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f785e;

    public /* synthetic */ f(String str, Context context, e eVar, int i7, int i8) {
        this.f782a = i8;
        this.f783b = str;
        this.f784c = context;
        this.d = eVar;
        this.f785e = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f782a) {
            case 0:
                return i.a(this.f783b, this.f784c, this.d, this.f785e);
            default:
                try {
                    return i.a(this.f783b, this.f784c, this.d, this.f785e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
