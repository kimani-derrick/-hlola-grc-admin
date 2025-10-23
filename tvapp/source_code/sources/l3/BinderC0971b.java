package l3;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.F;
import g3.n;
import java.lang.reflect.Field;
import o3.AbstractBinderC1067a;
/* renamed from: l3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0971b extends AbstractBinderC1067a implements InterfaceC0970a {
    public final Object d;

    public BinderC0971b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.d = obj;
    }

    public static Object A(InterfaceC0970a interfaceC0970a) {
        if (interfaceC0970a instanceof BinderC0971b) {
            return ((BinderC0971b) interfaceC0970a).d;
        }
        IBinder asBinder = interfaceC0970a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 == 1) {
            n.g(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
                } catch (NullPointerException e7) {
                    throw new IllegalArgumentException("Binder object is null.", e7);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l3.a, com.google.android.gms.internal.measurement.F] */
    public static InterfaceC0970a z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof InterfaceC0970a) {
            return (InterfaceC0970a) queryLocalInterface;
        }
        return new F(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }
}
