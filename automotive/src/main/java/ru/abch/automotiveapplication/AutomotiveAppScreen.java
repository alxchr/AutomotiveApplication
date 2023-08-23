package ru.abch.automotiveapplication;

import androidx.annotation.NonNull;
import androidx.car.app.CarContext;
import androidx.car.app.CarToast;
import androidx.car.app.Screen;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;

public class AutomotiveAppScreen  extends Screen {
    public AutomotiveAppScreen(@NonNull CarContext carContext) {
        super(carContext);
    }
    @NonNull
    @Override
    public Template onGetTemplate() {
        Row row = new Row.Builder()
                .setTitle("Thats our Automotive App!").build();
        Action action = new Action.Builder()
                .setOnClickListener(
                        () -> CarToast.makeText(getCarContext(), "Hello!", CarToast.LENGTH_SHORT).show())
                .setTitle("Say hi!")
                .build();

        ActionStrip actionStrip = new ActionStrip.Builder().addAction(action).build();
        return new PaneTemplate.Builder(
                new Pane.Builder()
                        .addRow(row)
                        .build()
        ).setActionStrip(actionStrip).setHeaderAction(Action.APP_ICON).build();
    }
}
