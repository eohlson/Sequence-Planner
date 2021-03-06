package sequenceplanner.view.operationView.graphextension;

import java.awt.Point;

import sequenceplanner.model.Model;
import sequenceplanner.model.data.Data;
import sequenceplanner.model.data.OperationData;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.util.mxRectangle;

/**
 * 
 * @author Erik Ohlson, erik.a.ohlson@gmail.com
 * 
 */
public class CellFactory {

	private static CellFactory factoryInstance = new CellFactory();

	private CellFactory() {
		// Make sure no more instances of this class can be created
	}

	public static CellFactory getInstance() {
		return factoryInstance;
	}

	public mxCell getEdge(boolean regular) {
		String style = regular ? "strokeColor=#000000;strokeWidth=2;endArrow=;"
				+ "edgeStyle=mxEdgeStyle.ElbowConnector;elbow=vertical;rounded=1"
				: "strokeColor=#000000;strokeWidth=2;endArrow=";
		mxCell edge = new Cell("edge", new mxGeometry(), style);

		edge.setEdge(true);
		edge.setConnectable(false);
		edge.getGeometry().setRelative(true);

		return edge;

	}

	public mxCell getOperationCell() {
		return getOperationCell(null);
	}

	public Cell getOperationCell(Point place) {
		if (place == null) {
			place = new Point(0, 0);
		}

		Data d = new OperationData("OP", -1);
		Model.giveId(d);
		d.setName("OP" + d.getId());

		Cell cell = new Cell(d, new mxGeometry(place.getX(), place.getY(), 40,
				20), "perimeter=custom.operationPerimeter;fillColor=#FFFF00");

		cell.setType(Cell.OP);
		cell.setId(null);
		cell.setVertex(true);
		cell.setConnectable(false);

		return cell;
	}

	public Cell getParallelCell(Point place) {
		if (place == null) {
			place = new Point(0, 0);
		}

		mxGeometry geo = new mxGeometry(place.getX(), place.getY(), 50, 40);
		geo.setAlternateBounds(new mxRectangle(place.getX(), place.getY(), 50,
				40));

		Data d = new Data("", -1);
		Model.giveId(d);
		System.out.println(d.getId());

		Cell cell = new Cell(d, geo, "perimeter=custom.parallelPerimeter;");

		cell.setType(Cell.PARALLEL);
		cell.setId(null);
		cell.setVertex(true);
		cell.setConnectable(false);

		return cell;
	}

	public Cell getAlternativeCell(Point place) {
		if (place == null) {
			place = new Point(0, 0);
		}

		Data d = new Data("", -1);
		Model.giveId(d);

		Cell cell = new Cell(d, new mxGeometry(place.getX(), place.getY(), 50,
				40), "perimeter=custom.alternativePerimeter;");
		cell.setType(Cell.ALTERNATIVE);
		cell.getGeometry().setAlternateBounds(
				new mxRectangle(place.getX(), place.getY(), 50, 40));
		cell.setId(null);
		cell.setVertex(true);
		cell.setConnectable(false);

		return cell;
	}

	public Cell getArbitraryCell(Point place) {
		if (place == null) {
			place = new Point(0, 0);
		}

		Data d = new Data("", -1);
		Model.giveId(d);

		Cell cell = new Cell(d, new mxGeometry(place.getX(), place.getY(), 50,
				40), "perimeter=custom.operationPerimeter;");
		cell.setType(Cell.ARBITRARY);
		cell.getGeometry().setAlternateBounds(
				new mxRectangle(place.getX(), place.getY(), 50, 40));
		cell.setId(null);
		cell.setVertex(true);
		cell.setConnectable(false);

		return cell;
	}

	public Cell getSOPCell(Point place) {
		if (place == null) {
			place = new Point(0, 0);
		}
		mxGeometry geo = new mxGeometry(place.getX(), place.getY(), 40, 20);
		geo.setAlternateBounds(new mxRectangle(0, 0, 100, 80));

		Data d = new OperationData("SOP", -1);
		Model.giveId(d);
		d.setName("OP" + d.getId());
		Cell cell = new Cell(d, geo,
				"perimeter=custom.operationPerimeter;fillColor=#FFFF00");
		cell.setType(Cell.SOP);
		cell.setId(null);
		cell.setVertex(true);
		cell.setConnectable(false);

		return cell;
	}

	public Cell getOperation(String type) {
		return getOperation(type, null);
	}

	public Cell getOperation(String type, Point place) {
		if (type.equals(SPGraphModel.TYPE_OPERATION)) {
			return getOperationCell(place);

		} else if (type.equals(SPGraphModel.TYPE_SOP)) {
			return getSOPCell(place);
		} else if (type.equals(SPGraphModel.TYPE_PARALLEL)) {
			return getParallelCell(place);
		} else if (type.equals(SPGraphModel.TYPE_ALTERNATIVE)) {
			return getAlternativeCell(place);
		} else if (type.equals(SPGraphModel.TYPE_ARBITRARY)) {
			return getArbitraryCell(place);
		}
		return null;
	}
}
