package b6;

import W5.r0;
/* loaded from: classes.dex */
public final class w extends M5.h implements L5.p {

    /* renamed from: s  reason: collision with root package name */
    public static final w f7215s = new w(2, 0);

    /* renamed from: t  reason: collision with root package name */
    public static final w f7216t = new w(2, 1);

    /* renamed from: u  reason: collision with root package name */
    public static final w f7217u = new w(2, 2);

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f7218r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i7, int i8) {
        super(i7);
        this.f7218r = i8;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        Integer num;
        int i7;
        switch (this.f7218r) {
            case 0:
                D5.g gVar = (D5.g) obj2;
                if (gVar instanceof r0) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i7 = num.intValue();
                    } else {
                        i7 = 1;
                    }
                    if (i7 == 0) {
                        return gVar;
                    }
                    return Integer.valueOf(i7 + 1);
                }
                return obj;
            case 1:
                r0 r0Var = (r0) obj;
                D5.g gVar2 = (D5.g) obj2;
                if (r0Var == null) {
                    if (gVar2 instanceof r0) {
                        return (r0) gVar2;
                    }
                    return null;
                }
                return r0Var;
            default:
                D5.g gVar3 = (D5.g) obj2;
                return (y) obj;
        }
    }
}
