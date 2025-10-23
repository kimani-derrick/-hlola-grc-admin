package n0;

import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class s extends M5.h implements L5.a {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f12581r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ t f12582s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t tVar, int i7) {
        super(0);
        this.f12581r = i7;
        this.f12582s = tVar;
    }

    @Override // L5.a
    public final Object b() {
        switch (this.f12581r) {
            case 0:
                String str = this.f12582s.f12591j;
                if (str != null) {
                    return Pattern.compile(str);
                }
                return null;
            default:
                String str2 = this.f12582s.f;
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
        }
    }
}
