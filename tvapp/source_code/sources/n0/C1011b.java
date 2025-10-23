package n0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
/* renamed from: n0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011b extends v {

    /* renamed from: A  reason: collision with root package name */
    public Intent f12520A;

    /* renamed from: B  reason: collision with root package name */
    public String f12521B;

    @Override // n0.v
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1011b) || !super.equals(obj)) {
            return false;
        }
        Intent intent = this.f12520A;
        if (intent != null) {
            if (!intent.filterEquals(((C1011b) obj).f12520A)) {
                return false;
            }
        } else if (((C1011b) obj).f12520A != null) {
            return false;
        }
        if (!M5.g.a(this.f12521B, ((C1011b) obj).f12521B)) {
            return false;
        }
        return true;
    }

    @Override // n0.v
    public final void h(Context context, AttributeSet attributeSet) {
        M5.g.f(context, "context");
        super.h(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, P.f12515a);
        M5.g.e(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
        String string = obtainAttributes.getString(4);
        if (string != null) {
            String packageName = context.getPackageName();
            M5.g.e(packageName, "context.packageName");
            string = U5.n.Z(string, "${applicationId}", packageName);
        }
        if (this.f12520A == null) {
            this.f12520A = new Intent();
        }
        Intent intent = this.f12520A;
        M5.g.c(intent);
        intent.setPackage(string);
        String string2 = obtainAttributes.getString(0);
        if (string2 != null) {
            if (string2.charAt(0) == '.') {
                string2 = context.getPackageName() + string2;
            }
            ComponentName componentName = new ComponentName(context, string2);
            if (this.f12520A == null) {
                this.f12520A = new Intent();
            }
            Intent intent2 = this.f12520A;
            M5.g.c(intent2);
            intent2.setComponent(componentName);
        }
        String string3 = obtainAttributes.getString(1);
        if (this.f12520A == null) {
            this.f12520A = new Intent();
        }
        Intent intent3 = this.f12520A;
        M5.g.c(intent3);
        intent3.setAction(string3);
        String string4 = obtainAttributes.getString(2);
        if (string4 != null) {
            Uri parse = Uri.parse(string4);
            if (this.f12520A == null) {
                this.f12520A = new Intent();
            }
            Intent intent4 = this.f12520A;
            M5.g.c(intent4);
            intent4.setData(parse);
        }
        this.f12521B = obtainAttributes.getString(3);
        obtainAttributes.recycle();
    }

    @Override // n0.v
    public final int hashCode() {
        int i7;
        int hashCode = super.hashCode() * 31;
        Intent intent = this.f12520A;
        int i8 = 0;
        if (intent != null) {
            i7 = intent.filterHashCode();
        } else {
            i7 = 0;
        }
        int i9 = (hashCode + i7) * 31;
        String str = this.f12521B;
        if (str != null) {
            i8 = str.hashCode();
        }
        return i9 + i8;
    }

    @Override // n0.v
    public final String toString() {
        ComponentName componentName;
        Intent intent = this.f12520A;
        String str = null;
        if (intent != null) {
            componentName = intent.getComponent();
        } else {
            componentName = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (componentName != null) {
            sb.append(" class=");
            sb.append(componentName.getClassName());
        } else {
            Intent intent2 = this.f12520A;
            if (intent2 != null) {
                str = intent2.getAction();
            }
            if (str != null) {
                sb.append(" action=");
                sb.append(str);
            }
        }
        String sb2 = sb.toString();
        M5.g.e(sb2, "sb.toString()");
        return sb2;
    }
}
