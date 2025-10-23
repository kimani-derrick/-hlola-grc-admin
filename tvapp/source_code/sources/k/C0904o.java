package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import com.boxhdo.android.tv.R;
import h6.C0761k;
/* renamed from: k.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904o {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f12071b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static C0904o f12072c;

    /* renamed from: a  reason: collision with root package name */
    public C0915t0 f12073a;

    public static synchronized PorterDuffColorFilter b(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter h7;
        synchronized (C0904o.class) {
            h7 = C0915t0.h(i7, mode);
        }
        return h7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k.o] */
    /* JADX WARN: Type inference failed for: r3v1, types: [z4.b, java.lang.Object] */
    public static synchronized void c() {
        synchronized (C0904o.class) {
            if (f12072c == null) {
                ?? obj = new Object();
                f12072c = obj;
                obj.f12073a = C0915t0.d();
                C0915t0 c0915t0 = f12072c.f12073a;
                ?? obj2 = new Object();
                obj2.f16461a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                obj2.f16462b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                obj2.f16463c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                obj2.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                obj2.f16464e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                obj2.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                c0915t0.k(obj2);
            }
        }
    }

    public static void d(Drawable drawable, C0761k c0761k, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = C0915t0.f12095h;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC0869T.f11941a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z7 = c0761k.f11168b;
            if (!z7 && !c0761k.f11167a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z7) {
                    colorStateList = (ColorStateList) c0761k.f11169c;
                } else {
                    colorStateList = null;
                }
                if (c0761k.f11167a) {
                    mode = (PorterDuff.Mode) c0761k.d;
                } else {
                    mode = C0915t0.f12095h;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = C0915t0.h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable a(Context context, int i7) {
        return this.f12073a.f(context, i7);
    }
}
