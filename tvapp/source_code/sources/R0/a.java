package R0;

import M5.h;
import h6.C0753c;
import h6.v;
import java.util.regex.Pattern;
import p6.l;
/* loaded from: classes.dex */
public final class a extends h implements L5.a {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f2862r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ b f2863s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i7) {
        super(0);
        this.f2862r = i7;
        this.f2863s = bVar;
    }

    @Override // L5.a
    public final Object b() {
        b bVar = this.f2863s;
        switch (this.f2862r) {
            case 0:
                C0753c c0753c = C0753c.n;
                return android.support.v4.media.session.b.x0(bVar.f);
            default:
                String b7 = bVar.f.b("Content-Type");
                if (b7 == null) {
                    return null;
                }
                Pattern pattern = v.d;
                try {
                    return l.r(b7);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }
}
