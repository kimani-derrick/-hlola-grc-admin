package androidx.leanback.widget;

import android.util.Property;
/* loaded from: classes.dex */
public final class W extends Property {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6563a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(Class cls, String str, int i7) {
        super(cls, str);
        this.f6563a = i7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f6563a) {
            case 0:
                return Float.valueOf(((X) obj).f6564a);
            case 1:
                return Float.valueOf(((X) obj).f6567e);
            case 2:
                return Float.valueOf(((X) obj).f6566c);
            default:
                return Integer.valueOf(((K0) obj).getStreamPosition());
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f6563a) {
            case 0:
                X x7 = (X) obj;
                x7.f6564a = ((Float) obj2).floatValue();
                x7.a();
                x7.f6571j.invalidate();
                return;
            case 1:
                X x8 = (X) obj;
                float floatValue = ((Float) obj2).floatValue();
                x8.f6567e = floatValue;
                float f = floatValue / 2.0f;
                x8.f = f;
                PagingIndicator pagingIndicator = x8.f6571j;
                x8.f6568g = f * pagingIndicator.f6454L;
                pagingIndicator.invalidate();
                return;
            case 2:
                X x9 = (X) obj;
                x9.f6566c = ((Float) obj2).floatValue() * x9.f6569h * x9.f6570i;
                x9.f6571j.invalidate();
                return;
            default:
                ((K0) obj).setStreamPosition(((Integer) obj2).intValue());
                return;
        }
    }
}
