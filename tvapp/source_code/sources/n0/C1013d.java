package n0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@M("activity")
/* renamed from: n0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1013d extends N {

    /* renamed from: c  reason: collision with root package name */
    public final Context f12531c;
    public final Activity d;

    public C1013d(Context context) {
        Object obj;
        M5.g.f(context, "context");
        this.f12531c = context;
        Iterator it = T5.j.K(context, C1012c.f12522s).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.d = (Activity) obj;
    }

    @Override // n0.N
    public final v a() {
        return new v(this);
    }

    @Override // n0.N
    public final v c(v vVar, Bundle bundle, C1002D c1002d) {
        Intent intent;
        int intExtra;
        C1011b c1011b = (C1011b) vVar;
        if (c1011b.f12520A != null) {
            Intent intent2 = new Intent(c1011b.f12520A);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = c1011b.f12521B;
                if (str != null && str.length() != 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            Activity activity = this.d;
            if (activity == null) {
                intent2.addFlags(268435456);
            }
            if (c1002d != null && c1002d.f12486a) {
                intent2.addFlags(536870912);
            }
            int i7 = 0;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", c1011b.f12607x);
            Context context = this.f12531c;
            Resources resources = context.getResources();
            if (c1002d != null) {
                int i8 = c1002d.f12491h;
                int i9 = c1002d.f12492i;
                if ((i8 > 0 && M5.g.a(resources.getResourceTypeName(i8), "animator")) || (i9 > 0 && M5.g.a(resources.getResourceTypeName(i9), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i8) + " and popExit resource " + resources.getResourceName(i9) + " when launching " + c1011b);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i8);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i9);
                }
            }
            context.startActivity(intent2);
            if (c1002d != null && activity != null) {
                int i10 = c1002d.f;
                int i11 = c1002d.f12490g;
                if ((i10 > 0 && M5.g.a(resources.getResourceTypeName(i10), "animator")) || (i11 > 0 && M5.g.a(resources.getResourceTypeName(i11), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i10) + " and exit resource " + resources.getResourceName(i11) + "when launching " + c1011b);
                    return null;
                } else if (i10 >= 0 || i11 >= 0) {
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    if (i11 >= 0) {
                        i7 = i11;
                    }
                    activity.overridePendingTransition(i10, i7);
                    return null;
                } else {
                    return null;
                }
            }
            return null;
        }
        throw new IllegalStateException(AbstractC0515y1.n(new StringBuilder("Destination "), c1011b.f12607x, " does not have an Intent set.").toString());
    }

    @Override // n0.N
    public final boolean j() {
        Activity activity = this.d;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
