package A1;

import A5.t;
import androidx.lifecycle.c0;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
/* loaded from: classes.dex */
public final class j extends M5.h implements L5.a {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f38r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ L5.a f39s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(L5.a aVar, int i7) {
        super(0);
        this.f38r = i7;
        this.f39s = aVar;
    }

    @Override // L5.a
    public final Object b() {
        switch (this.f38r) {
            case 0:
                return (c0) this.f39s.b();
            case 1:
                return (c0) this.f39s.b();
            case 2:
                return (c0) this.f39s.b();
            case 3:
                return (c0) this.f39s.b();
            case 4:
                return (c0) this.f39s.b();
            case 5:
                return (c0) this.f39s.b();
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                File file = (File) this.f39s.b();
                M5.g.f(file, "<this>");
                String name = file.getName();
                M5.g.e(name, "getName(...)");
                if (M5.g.a(U5.f.y0(name, '.', ""), "preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    return (List) this.f39s.b();
                } catch (SSLPeerUnverifiedException unused) {
                    return t.f135q;
                }
            case 8:
                return (c0) this.f39s.b();
            case 9:
                return (c0) this.f39s.b();
            case 10:
                return (c0) this.f39s.b();
            case 11:
                return (c0) this.f39s.b();
            case 12:
                return (c0) this.f39s.b();
            case 13:
                return (c0) this.f39s.b();
            case 14:
                return (c0) this.f39s.b();
            case 15:
                return (c0) this.f39s.b();
            default:
                return (c0) this.f39s.b();
        }
    }
}
